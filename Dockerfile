FROM registry.cn-beijing.aliyuncs.com/hhmedic/jdk8:0.0.1
ENV LANG en_US.UTF-8
ADD demo-1.0.0.jar app.jar
ADD start.sh /start.sh
RUN chmod a+x /start.sh
ENTRYPOINT ["/start.sh"]

