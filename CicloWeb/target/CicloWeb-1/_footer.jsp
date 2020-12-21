<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<footer>

    <div class="footer">
        <%
            Calendar calendar = new GregorianCalendar();
            int anno = calendar.get(Calendar.YEAR);

        %>

        <p>&copy; Sitio Desarrollado por Esau Brizuela Ruiz <%=anno%> </p>




    </div>

    <script src="script.js"></script>
</footer>
