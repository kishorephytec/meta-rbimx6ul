DESCRIPTION = "Random assortment of WSGI servers"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "CLOSED"
SRCNAME = "flup"


SRC_URI = "file://flup-py3-1.0.3.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools3 pypi

SRC_URI[md5sum] = "a64e7a6374e043480ee92534c735964e"
SRC_URI[sha256sum] = "5eb09f26eb0751f8380d8ac43d1dfb20e1d42eca0fa45ea9289fa532a79cd159"
