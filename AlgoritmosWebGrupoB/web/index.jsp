<%-- 
    Document   : index
    Created on : 06/05/2019, 08:16:47 AM
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        
        <%!            
     public long fibonacir(int numero){
        if(numero<0)
        return -1;
        else if(numero==0)
        return 0;
        else if(numero==1)
            return 1;
        else
            return fibonacir(numero-1)+fibonacir(numero-2);
        }
        %>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        out.print(fibonacir(8));
        %>
      
        <canvas height="3000" width="4000" id="micanvas"></canvas>
        
        <script type="text/javascript">
            var canvas=document.getElementById("micanvas");
            var ctx=canvas.getContext("2d");
            var img=new Image();
            img.src="conejo.png";
            
            img.onload=function(){
                var cantidad=prompt("Ingrese la cantidad de Años:");
                var result=0;var incx=0; var incy=0;
                for(i=1;i<=cantidad;i++){
                    result=fibonacir(i);
                    ctx.font="bold 22px sans-serif";
                    for(j=1;j<=result;j++){
                        ctx.drawImage(img, incx,incy);
                        ctx.fillText("C"+j,incx+15,incy+15);
                        incx=incx+100;
                    }
                    incx=0;
                    incy=incy+100;
                }                
            }
            
            function fibonacir(numero){
               if(numero>1){
                   return fibonacir(numero-1)+fibonacir(numero-2);
               } else if(numero==1){
                   return 1;
               }else if(numero==0){
                   return 0;
               }else{
                   return -1;
               }                
            }
            console.log(fibonacir(6));
        </script>        
    </body>
</html>
