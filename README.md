# spring aop实现mysql读写分离
# 首先搭建主从数据库，配置动态数据源，然后使用spring aop切面来过滤执行的sql，判断使用主库数据源或者从库数据源
