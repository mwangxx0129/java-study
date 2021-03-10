FROM oraclelinux:8-slim

LABEL "provider"="Oracle"                                               \
      "issues"="https://github.com/oracle/docker-images/issues"

ARG release=19
ARG update=9

RUN  microdnf install oracle-release-el8 && \
     microdnf install oracle-instantclient${release}.${update}-basic oracle-instantclient${release}.${update}-devel oracle-instantclient${release}.${update}-sqlplus && \
     microdnf clean all

# Uncomment if the tools package is added
# ENV PATH=$PATH:/usr/lib/oracle/${release}.${update}/client64/bin

CMD ["sh", "-c", "tail -f /dev/null"]