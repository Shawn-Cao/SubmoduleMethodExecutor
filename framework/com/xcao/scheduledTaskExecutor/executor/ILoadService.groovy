package com.xcao.scheduledTaskLoader.framework.executor

/**
 * ILoadService provides a central point for pre-load services across different modules
 */
public interface IPreloadService {
    /**
     * framework level service to eagerLoad functional services
     * @param preloadableEntry is directly configured in ApplicationFrameworkConfig/DB and should be get from calling preloadConfigService.getPreloadablesConfig()
     * @return true if accepted, false if not accepted
     */
    public boolean preloadReferenceData(String preloadableEntry, boolean isSchedulerRequest)

    /**
     * used in application info page to show Last updated time
     */
    public String getLastUpdateTime(String preloadableEntry)
}