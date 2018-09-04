https://github.com/deviantony/docker-elk


sudo chmod 777 elasticsearch/data/


curl -XDELETE "http://localhost:9200/logstash-*"

curl -XDELETE "http://localhost:9200/logstash-2018.09.*"

curl -XDELETE "http://localhost:9200/logstash-2018.09.04"


