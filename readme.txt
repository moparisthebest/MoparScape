This file uses unix line endings, programs like notepad don't understand them, so use at least wordpad.

With this latest release of MoparScape 4.1, it is now possible for anyone to write a custom client, of
any version, to run inside of MoparScape by simply supplying the URL for the custom client jar to MoparScape.

To do this, your client must have a class with the name 'client' in the default package, which implements
the org.moparscape.iface.ClientInterface interface.  For more info on how to implement that interface,
refer to the javadocs of the interface itself.

You can als