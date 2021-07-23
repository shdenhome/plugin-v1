package com.github.shdenhome.pluginv1.services

import com.github.shdenhome.pluginv1.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
