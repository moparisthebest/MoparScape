# MoparScape

This project contains the open source components of [MoparScape][3], as well as example client and server implementations.  It is provided as a convenient project built by maven that allows you to run `mvn package` to build and CRC all artifacts, and outputs HTML with links to immediately test your client/server inside MoparScape (inside folder `dist/target/`).

Clients are located in the clients module, and must have a class named `client` in the default package that implements `org.moparscape.iface.ClientInterface`.  Data for clients (otherwise known as cache) is in individual folders in the cachedump folder, 
which are distributed as zips.

Servers are located in the clients module, and must have a class named `server` in the default package that implements `org.moparscape.iface.ServerInterface`.  Data for clients is in the module folder for that particular server.  Servers are distributed as zips with all the data in there along with a server.jar containing the executable code.  The maven projects create this artifact for you.

Licensing
------------
Content of folders `java_client`, `hackme`, `dist`, `MoparScape`, and `servers/server317` is licensed under the [GNU/AGPLv3][2], the full text of which is included in `license.txt`.

Credits
------------
* clients/clientRSC - modified from [mpc-client](https://github.com/xetr0v/mpc-client)
* servers/server508 - modified from DavidScape
* servers/server317 - modified from [hybridscape](http://sourceforge.net/projects/hybridscape/)

Contributing
------------

1. Fork it. (Alternatively, if you **really** can't use github/git, email me a patch.)
2. Create a branch (`git checkout -b my_MoparScape`)
3. Commit your changes (`git commit -am "Implemented method X"`)
4. Push to the branch (`git push origin my_MoparScape`)
5. Open a [Pull Request][2]
6. Enjoy a refreshing beverage and wait

[1]: https://www.gnu.org/licenses/agpl.html
[2]: https://github.com/moparisthebest/MoparScape/pulls
[3]: https://www.moparscape.org/moparscape4.php
