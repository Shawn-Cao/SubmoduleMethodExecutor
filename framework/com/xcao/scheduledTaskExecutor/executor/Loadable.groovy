package com.xcao.scheduledTaskLoader.framework.executor

import com.xcao.scheduledTaskExecutor.framework.data.Identifiable

/**
 * defines the methods a loader service should implement (or service interface to extend)
 */
interface Loadable {
    /**
     * functional service should save data to cache and return successfully loaded or not with true/false
     */
    void LoadAll() throws Exception
    /**
     * check all required data key to determine isDataInCache
     */
    List<Identifiable> getDataKeys()
}
