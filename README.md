This is the Hydro-proxy guide.  

How to run hydro-proxy
So what you do is you unzip the Hydro-proxy.zip then you make gradelw executable then you do ./gradelw run

Just to lit you know hydro proxy supports any version of minecraft anda http and tcp and udp 

how to change the backend servers:
open ~/hydro-proxy/src/main/java/com/hydroproxy/HydroProxy.java then find     // Proxy listen port
    public static final int PROXY_PORT = 25567;

    // Backend server (your Paper/Purpur/etc)
    public static final String BACKEND_HOST = "127.0.0.1";
    public static final int BACKEND_PORT = 25566;

 change the PROXY_PORT to cange what the proxy is listening on and change the BACKEND_PORT to change it to your server's port. DO NOT CHANGE BACKEND_HOST.

 
how to add your custom server icon

Since HydroProxy is a custom Netty proxy, you must send the favicon in the STATUS response.

Minecraft expects the icon as Base64 PNG inside the JSON.

✔ Step 1 — Convert your PNG to Base64
Run:

bash
base64 -w 0 server-icon.png > icon.txt
Copy the output string.

✔ Step 2 — Insert it into your status JSON
In your handleStatus() method, change:

java
"description": { "text": "Hydro Proxy" }
to:

java
"description": { "text": "Hydro Proxy" },
"favicon": "data:image/png;base64,<your_base64_here>"
Full example:

java
String json = """
{
  "version": { "name": "HydroProxy", "protocol": %d },
  "players": { "max": 100, "online": 0 },
  "description": { "text": "Hydro Proxy" },
  "favicon": "data:image/png;base64,%s"
}
""".formatted(protocolVersion, ICON_BASE64);
Where ICON_BASE64 is a constant string containing your Base64 icon.
