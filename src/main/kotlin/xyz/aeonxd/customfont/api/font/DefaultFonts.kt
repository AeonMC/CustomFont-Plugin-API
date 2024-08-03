package xyz.aeonxd.customfont.api.font

import xyz.aeonxd.customfont.api.CustomFontPluginAPI

/**
 * An easy way to get the default fonts directly. This is the same as doing
 * `CustomFontPluginAPI#instance#fontManager#fromId(fontId)`
 *
 * These are all nullable as it's not known if they
 * have been removed from the configuration (fonts.yml).
 */
object DefaultFonts {

    private val fontManager
        get() = CustomFontPluginAPI.instance.fontManager

    @JvmStatic
    val Accent get() = fontManager.fromId("accent")

    @JvmStatic
    val Big get() = fontManager.fromId("big")

    @JvmStatic
    val Bubble get() = fontManager.fromId("bubble")

    @JvmStatic
    val Currency get() = fontManager.fromId("currency")

    @JvmStatic
    val Cursed get() = fontManager.fromId("cursed")

    @JvmStatic
    val Elegant get() = fontManager.fromId("elegant")

    @JvmStatic
    val Greek get() = fontManager.fromId("greek")

    @JvmStatic
    val Knight get() = fontManager.fromId("knight")

    @JvmStatic
    val Krypto get() = fontManager.fromId("krypto")

    @JvmStatic
    val Parenthesis get() = fontManager.fromId("parenthesis")

    @JvmStatic
    val Random get() = fontManager.fromId("random")

    @JvmStatic
    val Mini get() = fontManager.fromId("mini")

    @JvmStatic
    val Spaced get() = fontManager.fromId("spaced")

    @JvmStatic
    val Superscript get() = fontManager.fromId("superscript")

    @JvmStatic
    val Tail get() = fontManager.fromId("tail")

    @JvmStatic
    val UpsideDown1 get() = fontManager.fromId("upside-down-1")

    @JvmStatic
    val UpsideDown2 get() = fontManager.fromId("upside-down-2")

    @JvmStatic
    val UpsideDown3 get() = fontManager.fromId("upside-down-3")

    @JvmStatic
    val Weird get() = fontManager.fromId("weird")

    @JvmStatic
    val Custom1 get() = fontManager.fromId("custom-1")

    @JvmStatic
    val MiniThin get() = fontManager.fromId("mini-thin")

    @JvmStatic
    val MiniBold get() = fontManager.fromId("mini-bold")

    @JvmStatic
    val MiniItalic get() = fontManager.fromId("mini-italic")

    @JvmStatic
    val MiniBoldItalic get() = fontManager.fromId("mini-bold-italic")

    @JvmStatic
    val Calligraphy get() = fontManager.fromId("calligraphy")

    @JvmStatic
    val CalligraphyBold get() = fontManager.fromId("calligraphy-bold")

    @JvmStatic
    val Script get() = fontManager.fromId("script")

    @JvmStatic
    val ScriptBold get() = fontManager.fromId("script-bold")

    @JvmStatic
    val DoubleStruck get() = fontManager.fromId("double-struck")

    @JvmStatic
    val Box get() = fontManager.fromId("box")

    @JvmStatic
    val BoxLined get() = fontManager.fromId("box-lined")

    @JvmStatic
    val BoxFilled get() = fontManager.fromId("box-filled")

    @JvmStatic
    val DigitalNumbers get() = fontManager.fromId("digital-numbers")

    @JvmStatic
    val Circled get() = fontManager.fromId("circled")

}