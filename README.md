## ScalaCollider Template App

### statement

This is a template to make a ScalaCollider based OS X app, bundled with scsynth.

- Add your own code.
- Build scsynth.
- run 'appbundle' in sbt to repackage the app. This will create the whole osx app bundle.

### Downloading

You need to clone this project with submodules, e.g.

    git clone --recursive git://github.com/miguel-negrao/ScalaColliderAppTemplate.git

### Build scsynth

Note: You can use the `build_scsynth.sh` shell script to do this. The steps are:

```sh
cd scsynth
mkdir build
cd build
cmake -DCMAKE_BUILD_TYPE=Release ..
make install
```

### Building your app

    sbt appbundle

The result is a double-clickable standalone application `MyScalaColliderApp.app`.

### requirements / installation

Builds with sbt 0.11 and compiles against Scala 2.9.1 and Java 1.6. Depends on ScalaCollider.



