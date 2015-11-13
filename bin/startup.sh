#! /bin/sh
# Add the libraries to the AT_CLASSPATH.
# EXEDIR is the directory where this executable is.
cd ..

DIRLIBS=lib/*.jar
for i in ${DIRLIBS}
do
  if [ -z "$AT_CLASSPATH" ] ; then
    AT_CLASSPATH=$i
  else
    AT_CLASSPATH="$i":$AT_CLASSPATH
  fi
done

DIRLIBS=lib/*.zip
for i in ${DIRLIBS}
do
  if [ -z "$AT_CLASSPATH" ] ; then
    AT_CLASSPATH=$i
  else
    AT_CLASSPATH="$i":$AT_CLASSPATH
  fi
done

AT_CLASSPATH="out/production/AT":$AT_CLASSPATH


java -Xms128m -Xmx1024m -classpath "$AT_CLASSPATH:$CLASSPATH" org.archiviststoolkit.Main "$@"
