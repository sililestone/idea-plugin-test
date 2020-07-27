package com.github.sililestone.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.sililestone.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
