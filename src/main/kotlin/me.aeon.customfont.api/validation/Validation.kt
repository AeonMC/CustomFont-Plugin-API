package me.aeon.customfont.api.validation

import me.aeon.customfont.plugin.validation.LicenseValidation

interface Validation {

    fun validate(key: String): Pair<Long, Boolean>

    object Validator : Validation by LicenseValidation.Validator()

}