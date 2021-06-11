package com.github.masteroffreedom.deeplinkhelperdevelop.services

import com.github.masteroffreedom.deeplinkhelperdevelop.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
