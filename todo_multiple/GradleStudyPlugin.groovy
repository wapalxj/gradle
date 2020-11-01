package com.gradle.plugin

import org.apache.tools.ant.Project
import org.gradle.api.Plugin

/**
 * 自定义插件
 *
 */
class GradleStudyPlugin implements Plugin<Project> {

    /**
     *
     * @param project 引入了当前插件的project
     */
    @Override
    void apply(Project project) {
        println "hello plugin..."+project.name
    }
}
