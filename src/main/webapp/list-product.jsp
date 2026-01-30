<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Liste des produits</title>
</head>
<body>
<h1>Liste des produits</h1>

<p>Nombre total de produits : ${sessionScope.totalProducts}</p>

<c:choose>
    <c:when test="${not empty requestScope.products}">
        <table border="1">
            <tr>
                <th>Nom</th>
                <th>Quantité</th>
                <th>Categorie</th>
                <th>Prix</th>
            </tr>
            <c:forEach var="product" items="${requestScope.products}">
                <tr>
                    <td>${product.productName}</td>
                    <td>${product.quantity}</td>
                    <td>${product.category}</td>
                    <td>${product.price}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <p>Aucune commande enregistrée</p>
    </c:otherwise>
</c:choose>

<br>
<a href="index.jsp">Retour à l'accueil</a>
</body>
</html>
