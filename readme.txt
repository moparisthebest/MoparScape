This file uses unix line endings, programs like notepad don't understand them, so use at least wordpad.

With this latest release of MoparScape 4.1, it is now possible for anyone to write a custom client, of
any version, to run inside of MoparScape by simply supplying the URL for the custom client jar to MoparScape.

To do this, your client must have a class with the name 'client' in the default package, which implements
the org.moparscape.iface.ClientInterface interface.  For more info on how to implement that interface,
refer to the javadocs of the interface itself.

You can also write a custom server for your client.  It must have a class with the name 'server' in the
default package, which implements the org.moparscape.iface.ServerInterface interface. For more info on how
to implement that interface, refer to the javadocs of the interface itself.

If you have any questions, concerns, or bugs to report, post them on this thread:
http://www.moparscape.org/smf/index.php/topic,427512.0.html

Thanks,
moparisthebest