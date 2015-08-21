package com.xcao.scheduledTaskLoader.framework.executor

/**
 * allow definition class implementation in App module
 */
interface ILoadConfigService {
    /**
     * define the each of the loadable functions at framework level in this interface,
     * and convert it to loadable in the implementation in ApplicationMain module
     * sample <DeviceCatalog, <enabled: 'true', tidalTaskIntervalMinutes:'1440'>>
     * check grails-app/conf/ApplicationFrameworkConfig.groovy for details sample & config
     */
    public Map<String, Map<String, String>> getLoadablesConfig()

    /**
     * Search loadable from configs and existing definitions objects, if not found, try assemble on site 
    public Map<String, Loadable> getLoadables()
}
