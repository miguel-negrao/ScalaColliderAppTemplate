#!/bin/sh

cd scsynth
mkdir build
cd build
cmake -DCMAKE_BUILD_TYPE=Release ..
make install
