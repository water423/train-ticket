#!/usr/bin/env bash
set -eux

echo
echo "add jacoco.jar"
echo
for dir in ts-*; do
    if [[ -d $dir ]]; then
        if [[ -n $(ls "$dir" | grep -i Dockerfile) ]]; then
            echo "build ${dir}"
            cp /home/jacoco-0.8.2/lib/jacocoagent.jar ${dir}/target/
            docker build -t "$1"/"${dir}" "$dir"
            docker tag "$1"/"${dir}":latest "$1"/"${dir}":"$2"
        fi
    fi
done