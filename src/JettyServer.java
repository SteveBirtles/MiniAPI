import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JettyServer extends AbstractHandler {

    private static String megastring = "Is this the real life? | Is this just fantasy? | Caught in a landslide, | No escape from reality | Open your eyes, | Look up to the skies and see, | I'm just a poor boy, I need no sympathy, | Because I'm easy come, easy go | Little high, little low | Any way the wind blows doesn't really matter to me, to me | Mama, just killed a man | Put a gun against his head | Pulled my trigger, now he's dead | Mama, life had just begun | But now I've gone and thrown it all away | Mama, ooh (any way the wind blows) | Didn't mean to make you cry | If I'm not back again this time tomorrow | Carry on, carry on as if nothing really matters | Too late, my time has come | Sends shivers down my spine | Body's aching all the time | Goodbye, everybody, I've got to go | Gotta leave you all behind and face the truth | Mama, ooh (any way the wind blows) | I don't wanna die, | I sometimes wish I'd never been born at all | I see a little silhouetto of a man, | Scaramouche, Scaramouche, will you do the Fandango? | Thunderbolt and lightning | Very, very frightening me | (Galileo) Galileo | (Galileo) Galileo | Galileo Figaro | Magnifico-o-o-o-o | I'm just a poor boy, nobody loves me | He's just a poor boy from a poor family | Spare him his life from this monstrosity | Easy come, easy go, will you let me go? | Bismillah! No, we will not let you go (let him go!) | Bismillah! We will not let you go (let him go!) | Bismillah! We will not let you go (let him go!) | Will not let you go (let him go!) | Never, never let you go | Never let me go, oh | No, no, no, no, no, no, no | Oh, mama mia, mama mia (mama mia, let me go) | Beelzebub has a devil put aside for me, for me, for me | So you think you can stone me and spit in my eye? (Yeah!) | So you think you can love me and leave me to die? | Oh, baby, can't do this to me, baby | Just gotta get out, just gotta get right outta here | Nothing really matters | Anyone can see | Nothing really matters | Nothing really matters to me | Any way the wind blows |         ";

    public void handle(String target, Request baseRequest, HttpServletRequest request,
                       HttpServletResponse response) throws IOException, ServletException {

        int position = -1;
        int subposition = Integer.parseInt(request.getRemoteAddr().split(".")[3]);

        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        if (request.getRequestURI().equals("/favicon.ico")) return; // SKIP FAVICON REQUESTS;

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println();

        String requestText = "[ " + request.getRemoteAddr() + "  |  " + df.format(dateobj) + "  |  ";
        requestText += request.getMethod() + " ] \t " + request.getRequestURI() + " \t ";

        if (request.getQueryString() != null) {

            for (String q : request.getQueryString().split("&")) {
                if (q.contains("=")) {
                    String variable = q.split("=")[0];
                    String value = q.split("=")[1];
                    requestText += "   " + variable + " = " + value;

                    if (variable.equals("index")) position = Integer.parseInt(value);
                } else {
                    requestText += "   Invalid query string component (" + q + ")";
                }
            }

        } else {
            requestText += "   No query string supplied";
        }
        System.out.println(requestText);

        if (position != -1) {
            int x = (position + (subposition * 8)) % (megastring.length() - 8);
            String text = megastring.substring(x, 8);
            response.getWriter().println(text);
        }
        else {
            response.getWriter().println("Error!");
        }

        baseRequest.setHandled(true);

    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);
        server.setHandler(new JettyServer());
        server.start();
        server.join();
    }

}