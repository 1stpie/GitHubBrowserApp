package com.omjoonkim.project.githubBrowser.remote.mapper

import com.omjoonkim.project.githubBrowser.domain.entity.Fork
import com.omjoonkim.project.githubBrowser.remote.model.ForkModel

class ForkEntityMapper(
    private val userMapper: UserEntityMapper
) : EntityMapper<ForkModel, Fork> {

    override fun mapFrom(model: ForkModel) = Fork(
        model.name,
        model.fullName,
        userMapper.mapFrom(model.owner)
    )
}
