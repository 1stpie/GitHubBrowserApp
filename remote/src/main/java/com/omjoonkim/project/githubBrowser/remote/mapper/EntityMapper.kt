package com.omjoonkim.project.githubBrowser.remote.mapper

interface EntityMapper<in M, out E> {

    fun mapFrom(model: M): E

}
