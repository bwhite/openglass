gcc -fPIC -shared -Wl,-soname,libvision_sample.so -o libvision_sample.so vision_sample.c -lopencv_core -lopencv_highgui -Wall

gcc -fPIC main_test.c vision_sample.c -lopencv_core -lopencv_highgui -Wall -o main_test -g