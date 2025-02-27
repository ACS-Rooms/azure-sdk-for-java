// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.GitHubActionConfiguration;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Source control configuration for an app. */
@Fluent
public final class SiteSourceControlInner extends ProxyOnlyResource {
    /*
     * SiteSourceControl resource specific properties
     */
    @JsonProperty(value = "properties")
    private SiteSourceControlProperties innerProperties;

    /**
     * Get the innerProperties property: SiteSourceControl resource specific properties.
     *
     * @return the innerProperties value.
     */
    private SiteSourceControlProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SiteSourceControlInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the repoUrl property: Repository or source control URL.
     *
     * @return the repoUrl value.
     */
    public String repoUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().repoUrl();
    }

    /**
     * Set the repoUrl property: Repository or source control URL.
     *
     * @param repoUrl the repoUrl value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withRepoUrl(String repoUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withRepoUrl(repoUrl);
        return this;
    }

    /**
     * Get the branch property: Name of branch to use for deployment.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: Name of branch to use for deployment.
     *
     * @param branch the branch value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the isManualIntegration property: &lt;code&gt;true&lt;/code&gt; to limit to manual integration;
     * &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like
     * GitHub).
     *
     * @return the isManualIntegration value.
     */
    public Boolean isManualIntegration() {
        return this.innerProperties() == null ? null : this.innerProperties().isManualIntegration();
    }

    /**
     * Set the isManualIntegration property: &lt;code&gt;true&lt;/code&gt; to limit to manual integration;
     * &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like
     * GitHub).
     *
     * @param isManualIntegration the isManualIntegration value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withIsManualIntegration(Boolean isManualIntegration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withIsManualIntegration(isManualIntegration);
        return this;
    }

    /**
     * Get the isGitHubAction property: &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     *
     * @return the isGitHubAction value.
     */
    public Boolean isGitHubAction() {
        return this.innerProperties() == null ? null : this.innerProperties().isGitHubAction();
    }

    /**
     * Set the isGitHubAction property: &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     *
     * @param isGitHubAction the isGitHubAction value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withIsGitHubAction(Boolean isGitHubAction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withIsGitHubAction(isGitHubAction);
        return this;
    }

    /**
     * Get the deploymentRollbackEnabled property: &lt;code&gt;true&lt;/code&gt; to enable deployment rollback;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the deploymentRollbackEnabled value.
     */
    public Boolean deploymentRollbackEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentRollbackEnabled();
    }

    /**
     * Set the deploymentRollbackEnabled property: &lt;code&gt;true&lt;/code&gt; to enable deployment rollback;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param deploymentRollbackEnabled the deploymentRollbackEnabled value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withDeploymentRollbackEnabled(Boolean deploymentRollbackEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withDeploymentRollbackEnabled(deploymentRollbackEnabled);
        return this;
    }

    /**
     * Get the isMercurial property: &lt;code&gt;true&lt;/code&gt; for a Mercurial repository;
     * &lt;code&gt;false&lt;/code&gt; for a Git repository.
     *
     * @return the isMercurial value.
     */
    public Boolean isMercurial() {
        return this.innerProperties() == null ? null : this.innerProperties().isMercurial();
    }

    /**
     * Set the isMercurial property: &lt;code&gt;true&lt;/code&gt; for a Mercurial repository;
     * &lt;code&gt;false&lt;/code&gt; for a Git repository.
     *
     * @param isMercurial the isMercurial value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withIsMercurial(Boolean isMercurial) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withIsMercurial(isMercurial);
        return this;
    }

    /**
     * Get the gitHubActionConfiguration property: If GitHub Action is selected, than the associated configuration.
     *
     * @return the gitHubActionConfiguration value.
     */
    public GitHubActionConfiguration gitHubActionConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().gitHubActionConfiguration();
    }

    /**
     * Set the gitHubActionConfiguration property: If GitHub Action is selected, than the associated configuration.
     *
     * @param gitHubActionConfiguration the gitHubActionConfiguration value to set.
     * @return the SiteSourceControlInner object itself.
     */
    public SiteSourceControlInner withGitHubActionConfiguration(GitHubActionConfiguration gitHubActionConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SiteSourceControlProperties();
        }
        this.innerProperties().withGitHubActionConfiguration(gitHubActionConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
