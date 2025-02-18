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
``` git clone https://github.com/your-username/spring-jpa-demo.git
``` cd spring-jpa-demo
  
