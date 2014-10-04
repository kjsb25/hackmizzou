/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackmizzou;

/**
 *
 * @author Keenan
 */
public class TwilioServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
      TwiMLResponse twiml = new TwiMLResponse();
      Message message = new Message("Hello, Mobile Monkey");
      try {
        twiml.append(message);
      } catch (TwiMLException e) {
        e.printStackTrace();
      }
 
    response.setContentType("application/xml");
    response.getWriter().print(twiml.toXML());
    }
}
