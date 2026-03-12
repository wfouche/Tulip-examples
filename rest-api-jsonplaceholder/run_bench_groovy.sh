jbang run \
   --java 21 \
   --runtime-option -Xmx512m \
   --runtime-option -XX:+UseZGC \
   --files logback.xml \
   --deps io.github.tulipltt:tulip-runtime:2.2.3 \
   -m io.github.tulipltt.tulip.api.TulipApi \
   APIUser.groovy \
   --config benchmark_config.json

./gen_report.sh

firefox benchmark_report.html
