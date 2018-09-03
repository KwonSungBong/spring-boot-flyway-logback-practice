https://hub.docker.com/r/sebp/elk/


sudo sysctl -w vm.max_map_count=262144


sudo chmod 777 elasticsearch-data/

sudo chmod 777 elasticsearch-log/

sudo chmod 777 kibana-conf/

sudo chmod 777 kibana-log/

sudo chmod 777 logstash-conf/

sudo chmod 777 logstash-log/


docker-compose up -d
