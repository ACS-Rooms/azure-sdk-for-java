// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.UrlBuilder;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;

/**
 * The pipeline policy that adds a given port to each {@link HttpRequest}.
 */
public class PortPolicy implements HttpPipelinePolicy {
    private static final ClientLogger LOGGER = new ClientLogger(PortPolicy.class);

    private final int port;
    private final boolean overwrite;

    /**
     * Creates a new PortPolicy object.
     *
     * @param port The port to set.
     * @param overwrite Whether to overwrite a {@link HttpRequest HttpRequest's} port if it already has one.
     */
    public PortPolicy(int port, boolean overwrite) {
        this.port = port;
        this.overwrite = overwrite;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        final UrlBuilder urlBuilder = UrlBuilder.parse(context.getHttpRequest().getUrl());
        if (overwrite || urlBuilder.getPort() == null) {
            LOGGER.log(LogLevel.VERBOSE, () -> "Changing port to " + port);

            try {
                context.getHttpRequest().setUrl(urlBuilder.setPort(port).toUrl());
            } catch (MalformedURLException e) {
                return Mono.error(new RuntimeException("Failed to set the HTTP request port to " + port + ".", e));
            }
        }
        return next.process();
    }
}
