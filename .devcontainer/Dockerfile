# syntax=docker/dockerfile:1
FROM debian:bookworm-slim

RUN apt-get update && apt-get install -y \
  libxkbcommon0 \
  ca-certificates \
  ca-certificates-java \
  make \
  curl \
  git \
  openjdk-17-jdk \
  unzip \
  libc++1 \
  vim \
  && apt-get clean autoclean

WORKDIR /workspace

COPY . /workspace
