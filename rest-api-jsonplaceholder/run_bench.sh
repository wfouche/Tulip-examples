jbang run \
   --java 21 \
   --runtime-option -Xmx512m \
   --runtime-option -XX:+UseZGC \
   --files logback.xml \
   --deps io.github.wfouche.tulip:tulip-runtime:2.2.3 \
   -m io.github.wfouche.tulip.api.TulipApi \
   APIUser.java \
   --config benchmark_config.json

./gen_report.sh

firefox benchmark_report.html
