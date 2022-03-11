# How to use TerminatorPlus

## Foreword

We have received numerous requests from viewers that are not familiar with technicalities of minecraft
but are still interested in playing with the TerminatorPlus plugin. This guide is supposed to teach everyone how
to play with the plugin without any prior technical knowledge or understanding.

TerminatorPlus is not a datapack you can drag into your world folder or a mod you run with one of the
available mod loaders, but a Spigot plugin for the Spigot minecraft server. Spigot is a modified version of the vanilla
Minecraft: Java Edition server that adds a plugin API for developers to hook into. This means that you must use a spigot server to install
and use a Spigot plugin, including TerminatorPlus. Luckily, you don't need to purchase a server if you want to play
alone. You can simply boot up a spigot server on your PC, install TerminatorPlus and join the server you hosted on your PC.

## Steps

**Step 0: Check that you have installed Java 18** \
To run a Spigot server, you must have Java 18 installed.
Please check if you have Java 18 installed by typing ``cmd`` into the Windows search bar and hitting enter.
Then type ``java --version``. If the command is unknown, you don't have any Java version installed.
If the command returns a Java version older than 18, please update your Java installation.

**Step 1: Download the Paper server** \
Paper is a fork of Spigot, which unlike Spigot, you can simply download from their website.
Go to https://papermc.io/downloads and click the first blue button to download the Paper server.

**Step 2: Initial startup** \
Now you should create a folder where you want to run the server from, as the Paper jar is going to download some
files. To start the Paper server, you can simply double-click it.
After a few seconds, a window should appear and close again. Additionally, a file called eula.txt has been created
in your folder. If this doesn't work, please follow Troubleshooting A.

**Step 3: License agreement** \
You must now open the eula.txt file, read the license agreement and, if you agree, replace the ``false``
at the end of the file with ``true``.

**Step 4: Creating a world** \
You can now start the Paper server again by double-clicking on the jar file (or running the script if you followed
Troubleshooting A). After a few seconds, the server console should open and stay open until you stop the server.
The server will create a world for you and the plugins folder.

**Step 5: Installing TerminatorPlus** \
You may now download the latest version of the TerminatorPlus plugin from the #tplus-releases channel and drag the
downloaded jar file into the plugins folder that was just created. Now, stop the server by typing ``stop``
into the small text bar under the Logs and chat view (or just type it into the console window if you followed
Troubleshooting A) and start it again as you did before.
After restarting, you should see a message saying ``Loading TerminatorPlus v3.1-BETA`` somewhere in the server console. 
Meaning that the plugin has loaded successfully.

**Step 6: Connecting to your local server** \
You can now start your game, click on Multiplayer and connect to ``localhost``. Note that there is no TLD like .com,
just ``localhost``. You should now spawn into your local server world.

**Step 5: Gaining operator status** \
To access commands on your local server, you need to give yourself operator status. To do this, simply type ``op``
followed by your username into your console the same way you stopped the server in Step 5.
You will also see a confirmation message in-game if everything worked out correctly.

**Step 6: Have fun** \
You are done now! You can type /bot or /ai to play around with the plugin. With operator status, you can also access
all commands of singleplayer. If you want to stop the server, use the stop command in console or in-game, as changes to
the world might be lost otherwise.

## Troubleshooting

**Troubleshooting A** \
This section is for everyone who has issues with starting the server using the server gui.
To get around this issue, you must create a start script that will start the server in a console window instead.
Firstly, rename the downloaded Paper server file from paper-1.18.2-xxx to server.
Now to creating this starting script: Simply open notepad and type the following:
``java -jar server.jar``
now save the file as ``start.bat`` in the same folder as your server file, and
**change the file type in the save dialouge from Text files to All, otherwise the starting script will just
open notepad again!** Now click double-click the starting script you just created. If you have done everything correctly,
a command line window will pop up and close again if you are at Step 2. This window contains the log. You can also type
commands into the command line window to run them as the server console.