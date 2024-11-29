create database VBoxData;

use VBoxData;

CREATE TABLE ITRequest (
    ReqID INT AUTO_INCREMENT PRIMARY KEY,
    ReqName VARCHAR(255) NOT NULL,
    ReqDate DATE NOT NULL,
    ReqEmail VARCHAR(255) NOT NULL,
    ReqType VARCHAR(255),
    ReqDetails VARCHAR(255)
);

INSERT INTO ITRequest (ReqName, ReqDate, ReqEmail, ReqType, ReqDetails)
VALUES 
('Nguyễn Văn A', '2024-11-01', 'nguyenvana@example.com', 'Kỹ thuật', 'Cài đặt hệ thống cho phòng Nhân sự'),
('Trần Thị B', '2024-11-02', 'tranthib@example.com', 'Phần mềm', 'Cài đặt phần mềm mới cho phòng Marketing'),
('Lê Văn C', '2024-11-03', 'levanc@example.com', 'Kỹ thuật', 'Cập nhật trang web công ty'),
('Phạm Thị D', '2024-11-04', 'phamthid@example.com', 'Phần cứng', 'Thay thế ổ cứng bị lỗi trong phòng máy chủ'),
('Hoàng Anh E', '2024-11-05', 'hoanganhe@example.com', 'Kỹ thuật', 'Cấu hình máy in mạng trong văn phòng');


