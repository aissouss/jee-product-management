# 🛒 Product Management — Jakarta EE

> **Academic Project (Exam)** — A Java web application for product management built with Jakarta EE Servlets, JSP pages, and the DAO pattern.

---

## ✨ Features

- ➕ **Add a product** — form with name, quantity, category, and price
- 📋 **List all products** — table view of all saved products
- 🔢 **Session tracking** — total product count stored in HTTP session
- 🔁 **MVC pattern** — clean separation between Servlets (controller), JSP (view), and DAO (model)

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| [Java 25](https://openjdk.org/) | Primary language |
| [Jakarta Servlet 6.1](https://jakarta.ee/) | HTTP request handling |
| [JSP + JSTL 3.0](https://jakarta.ee/) | Server-side HTML rendering |
| [Jersey 4.0](https://eclipse-ee4j.github.io/jersey/) | JAX-RS REST support |
| [Maven](https://maven.apache.org/) | Build & dependency management |
| WAR packaging | Deployment on servlet container (Tomcat) |

---

## 🏗️ Architecture

This project follows the **MVC** (Model-View-Controller) pattern:

```
src/main/
├── java/mcu/examen2026aissyaboukraa/
│   ├── model/
│   │   └── Product.java          # Entity: id, name, quantity, category, price
│   ├── dao/
│   │   └── ProductDAO.java       # In-memory data access (ArrayList)
│   └── servlet/
│       ├── AddProductServlet.java    # POST /addProduct
│       └── ListProductServlet.java   # GET  /products
└── webapp/
    ├── index.jsp                 # Home page with navigation
    ├── add-product.jsp           # Add product form
    ├── list-product.jsp          # Products list table
    └── WEB-INF/web.xml
```

### Request Flow

```
Browser → Servlet (Controller) → ProductDAO (Model) → JSP (View) → Browser
```

---

## 🗄️ Data Model

```java
Product {
    int    id           // Auto-incremented
    String productName
    int    quantity
    String category
    int    price
}
```

> Data is stored **in-memory** (no database) — the product list resets on server restart.

---

## 🚀 Getting Started

### Prerequisites

- [Java JDK 17+](https://openjdk.org/)
- [Apache Tomcat 10+](https://tomcat.apache.org/) (supports Jakarta EE)
- [Maven](https://maven.apache.org/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### Build & Deploy

```bash
# 1. Clone the repository
git clone https://github.com/aissouss/jee-product-management.git
cd jee-product-management

# 2. Build the WAR file
./mvnw package

# 3. Deploy to Tomcat
# Copy target/teste-1.0-SNAPSHOT.war to Tomcat's webapps/ folder
# Then start Tomcat and open:
# http://localhost:8080/teste-1.0-SNAPSHOT/
```

### With IntelliJ IDEA

1. Open the project
2. Configure a **Tomcat local server** in Run Configurations
3. Add the WAR artifact to deploy
4. Click ▶ Run

---

## 📄 Endpoints

| Method | URL | Description |
|---|---|---|
| GET | `/` | Home page |
| GET | `/add-product.jsp` | Add product form |
| POST | `/addProduct` | Save new product |
| GET | `/products` | List all products |

---

## 🎓 Academic Context

This project was developed as a Java EE exam during the L3 Software Engineering program.

**Authors:** Aissya Boukraa  
[GitHub](https://github.com/aissouss)

---

## 📄 License

This project is for educational use only.
