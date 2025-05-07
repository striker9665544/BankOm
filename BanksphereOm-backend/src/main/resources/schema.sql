CREATE TABLE user_entity (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(100) NOT NULL,
  account_number VARCHAR(20) UNIQUE NOT NULL
);
CREATE TABLE account (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  account_number VARCHAR(20) UNIQUE NOT NULL,
  mobile_number VARCHAR(15),
  balance DOUBLE
);
CREATE TABLE transaction (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  account_number VARCHAR(20),
  type VARCHAR(20),
  amount DOUBLE,
  date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE loan (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  account_number VARCHAR(20),
  principal DOUBLE,
  interest_rate DOUBLE,
  tenure_months INT,
  emi DOUBLE
);
INSERT INTO account(account_number, mobile_number, balance) VALUES
  ('ACC1001','9876543210',10000),
  ('ACC1002','9876543211',15000),
  ('ACC1003','9876543212',20000),
  ('ACC1004','9876543213',25000),
  ('ACC1005','9876543214',30000),
  ('ACC1006','9876543215',35000),
  ('ACC1007','9876543216',40000),
  ('ACC1008','9876543217',45000),
  ('ACC1009','9876543218',50000),
  ('ACC1010','9876543219',55000);
INSERT INTO user_entity(username, password, account_number) VALUES
  ('user1','pass1','ACC1001'),
  ('user2','pass2','ACC1002'),
  ('user3','pass3','ACC1003'),
  ('user4','pass4','ACC1004'),
  ('user5','pass5','ACC1005'),
  ('user6','pass6','ACC1006'),
  ('user7','pass7','ACC1007'),
  ('user8','pass8','ACC1008'),
  ('user9','pass9','ACC1009'),
  ('user10','pass10','ACC1010');
