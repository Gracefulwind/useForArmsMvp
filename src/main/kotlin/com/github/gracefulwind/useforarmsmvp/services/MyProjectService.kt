package com.github.gracefulwind.useforarmsmvp.services

import com.github.gracefulwind.useforarmsmvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
