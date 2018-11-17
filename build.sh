#!/bin/bash
source enviroment.sh

# result=$( docker image ls | grep $IMAGE_NAME )

# # var=$1

# # if [[ -n "$result" ]]; then
#   # mkdir -p $FOLDER_PATH/data
#   # docker create --name=$CONTAINER_NAME --restart=unless-stopped -v $FOLDER_PATH/data:/usr/data $IMAGE_NAME
#   # docker start $IMAGE_NAME $var
# # else
#   # docker start $IMAGE_NAME $var
# # fi
# mkdir -p $FOLDER_PATH/data
# docker build -t $IMAGE_NAME -f Dockerfile $FOLDER_PATH
# # docker run -d --rm  --name=$CONTAINER_NAME -v $FOLDER_PATH/data:/usr/data $IMAGE_NAME $var
docker build -t $IMAGE_NAME -f Dockerfile .