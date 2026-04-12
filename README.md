This is the Hydro-proxy guide.  

How to run hydro-proxy
So what you do is you unzip the Hydro-proxy.zip then you make gradelw executable then you do ./gradelw run

Just to lit you know hydro proxy supports any version of minecraft

how to change the backend servers:
open ~/hydro-proxy/src/main/java/com/hydroproxy/HydroProxy.java then find     // Proxy listen port
    public static final int PROXY_PORT = 25567;

    // Backend server (your Paper/Purpur/etc)
    public static final String BACKEND_HOST = "127.0.0.1";
    public static final int BACKEND_PORT = 25566;

 change the PROXY_PORT to cange what the proxy is listening on and change the BACKEND_PORT to change it to your server's port. DO NOT CHANGE BACKEND_HOST.

 
