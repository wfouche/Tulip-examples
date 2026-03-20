call jbang.cmd run ^
   --java 21 ^
   --runtime-option -Xmx512m ^
   --runtime-option -XX:+UseZGC ^
   --files logback.xml ^
   --deps io.github.wfouche.tulip:tulip-runtime:2.3.0 ^
   -m io.github.wfouche.tulip.api.TulipApi ^
   APIUser.kt ^
   --config benchmark_config.json

call gen_report.cmd

start benchmark_report.html
