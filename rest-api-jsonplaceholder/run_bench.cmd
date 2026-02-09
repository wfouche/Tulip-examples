call jbang.cmd run ^
   --java 25 ^
   --files logback.xml ^
   --deps io.github.wfouche.tulip:tulip-runtime:2.2.3 ^
   -m io.github.wfouche.tulip.api.TulipApi ^
   APIUser.java ^
   --config benchmark_config.json

call gen_report.cmd