echo "start package...."

mvn package -Dmaven.test.skip=true  -Denv=dev

echo "end package...."