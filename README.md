## ScalaCollider Template App

### statement

This is a template to make a ScalaCollider based OSX app. 

- Add your own code.
- Build scsynth.
- run 'appbundle' in sbt to repackage the app. This will create the whole osx app bundle.

###Build scsynth

```sh
git clone --recursive git://github.com/miguel-negrao/ScalaColliderAppTemplate.git
cd scsynth
mkdir build
cd build
cmake -DCMAKE_BUILD_TYPE=Release ..
make install
```

### requirements / installation

Builds with sbt 0.11 and compiles against Scala 2.9.1 and Java 1.6. Depends on ScalaCollider.



