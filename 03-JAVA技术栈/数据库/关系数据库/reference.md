# Mysql
- Mysql技术内幕

# Oracle
- 收获，不止Oracle


# 各个数据库底层原理及横向对比
- 底层：
  - mysql：Iot表，索引组织表（主键索引到叶子节点存储整行数据）
  - orcle：索引B+树
  
- 解析：
  - mysql没有软解析

- 字符集：oracle可以设定
  - oracle：一般是按字符，select lengthb('中') from dual;
  - mysql 5.0默认存字符

- 锁
  - 各个语句加什么锁