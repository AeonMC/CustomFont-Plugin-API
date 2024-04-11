**Description**<br>
This API provides you various functionalities from the plugin <a href=https://aeonxd.gitbook.io/docs/plugins/customfont>CustomFont</a>

**Features**
- Create new custom fonts
- Translate text
- Listen to and intercept events
    - When a player sends a message
    - When a custom font is being set/reset/unset
- Manage user data (set/reset/unset)
- Remove player data (bulk removal)
- Retrieve configuration values
- Read and write cache values

**Installation**<br>
Download latest release from <a href="https://github.com/AeonMC/CustomFont-Plugin-API/releases">here</a><br>
Download the latest commons lib from <a href="https://github.com/AeonMC/Aeons-Commons-Lib/releases">here</a>

*Gradle Kotlin*<br>
<code>compileOnly(fileTree("PATH_TO_API"))
compileOnly(fileTree("PATH_TO_LIB"))</code>

*Maven*
<body><pre><code>&lt;dependency&gt;
    &lt;groupId&gt;me.aeon&lt;/groupId&gt;
    &lt;artifactId&gt;customfont-plugin-api&lt;/artifactId&gt;
    &lt;version&gt;1.0.1&lt;/version&gt;
    &lt;scope&gt;system&lt;/scope&gt;
    &lt;systemPath&gt;PATH_TO_JAR&lt;/systemPath&gt;
&lt;/dependency&gt;
&lt;dependency&gt;
    &lt;groupId&gt;me.aeon&lt;/groupId&gt;
    &lt;artifactId&gt;aeons-commons-lib&lt;/artifactId&gt;
    &lt;version&gt;1.0.0&lt;/version&gt;
    &lt;scope&gt;system&lt;/scope&gt;
    &lt;systemPath&gt;PATH_TO_JAR&lt;/systemPath&gt;
&lt;/dependency&gt;</code>
</pre></body>
PS: Sorry for the inconvenience

Here's how you can translate "hello" to "ʜᴇʟʟᴏ" with the "mini" font
<body><pre>
<code>val customFontAPI = CustomFontAPI.INSTANCE
val fontManager = customFontAPI.fontManager
val miniFont = fontManager.fromId("mini")
val translated = TextTranslator.translate("hello", miniFont)</code>
</pre></body>

Here's how you can create a new CustomFont
<body><pre>
<code>val font = CustomFont.Builder()
    .id("mini")
    .permission("customfont.font.mini")
    .characters(CharacterType.LOWERCASE, "ᴀʙᴄᴅᴇꜰɢʜɪᴊᴋʟᴍɴᴏᴘꞯʀꜱᴛᴜᴠᴡxʏᴢ")
    .characters(CharacterType.UPPERCASE, "ᴀʙᴄᴅᴇꜰɢʜɪᴊᴋʟᴍɴᴏᴘꞯʀꜱᴛᴜᴠᴡxʏᴢ")
    .build()</code>
</pre></body>

You can intercept events by listening to them and modifying as needed. Here's an example where a player cannot reset their font because they lack permissions
<body><pre>
<code>class CustomFontResetListener : Listener {
    void onCustomFontReset(e: CustomFontResetEvent) {
        if (!e.player.hasPermission("customfont.reset")) {
            e.isCancelled = true
        }
    }
}</code>
</pre></body>