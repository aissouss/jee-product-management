<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un Produit</title>
</head>
<body>
<h1>Ajouter un produit</h1>
<form action="addProduct" method="post">
    <label>Nom du produit :</label><br>
    <input type="text" name="productName" required><br><br>

    <label>Quantité :</label><br>
    <input type="number" name="quantity" required><br><br>

    <label>Categorie :</label><br>
    <input type="text" name="category" required><br><br>

    <label>Prix :</label><br>
    <input type="number" name="price" required><br><br>

    <input type="submit" value="Ajouter">
</form>
</body>
</html>
