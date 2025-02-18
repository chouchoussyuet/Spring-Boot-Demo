# Spring Boot – Spring Data JPA

## Thông tin sinh viên 
- Họ và tên: Nguyễn Hà Linh
- MSSV: 22024505

## Giới thiệu 
Dự án này là một ứng dụng REST API đơn giản sử dụng Spring Boot, Spring Data JPA, và MySQL. Ứng dụng cung cấp API để quản lý thông tin nhân viên, bao gồm thêm, lấy danh sách, tìm theo ID và xóa nhân viên.

## Công nghệ sử dụng: 
- Spring Boot 2.6.1
- Spring Data JPA
- MySQL (hoặc H2 Database nếu muốn chạy thử nhanh)
- Hibernate
- Maven
- Java 11+

## Cấu trúc thư mục 
spring-jpa-demo
│── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example
│   │   │       ├── controller  # Chứa các API endpoints
│   │   │       ├── modal       # Chứa các model (Entity)
│   │   │       ├── repository  # Chứa JPA repository
│   │   │       ├── service     # Chứa logic xử lý
│   │   │       ├── SpringJpaDemoApplication.java  # File khởi động ứng dụng
│   ├── resources
│   │   ├── application.properties  # Cấu hình database
│   ├── test  # Chứa các test cases
│── pom.xml  # File cấu hình Maven
│── README.md  # Tài liệu hướng dẫn

## Cài đặt và chạy dự án
### 1. Clone dự án 
``` git clone https://github.com/your-username/spring-jpa-demo.git ```
``` cd spring-jpa-demo ``` 
### Cấu hình MySQL (trong file application.properties)
```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
```
### Cài đặt dependencies:
```
mvn clean install
```
### Chạy ứng dụng:
```
mvn spring-boot:run
```
### Gửi request đến API 
- Thêm nhân viên (POST)
```
curl -X POST http://localhost:8080/employee/
```
- Lấy danh sách tất cả các nhân viên (GET)
```
curl -X POST http://localhost:8080/employee/
```

## API Endpoints

| HTTP Method | Endpoint                 | Chức năng                     |
|------------|--------------------------|-------------------------------|
| POST       | `/employee/`             | Thêm danh sách nhân viên      |
| GET        | `/employee/findall`      | Lấy danh sách tất cả nhân viên |
| GET        | `/employee/findbyid/{id}` | Lấy nhân viên theo ID         |
| DELETE     | `/employee/delete`       | Xóa tất cả dữ liệu            |


## Demo 
![image](https://github.com/user-attachments/assets/14636317-8c78-48e3-b90d-042f43a6f251)

