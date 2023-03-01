SUMMARY = "Python schedule module for job scheduling"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6400f153491d45ea3459761627ca24b2"

BRANCH = "release-1.1.0"
SRC_URI = "git://github.com/dbader/schedule.git;protocol=https;branch=${BRANCH}"
SRCREV = "ccc6dd6bf98ea41542576b1e4015660c3c3ae8f3"

#S = "${WORKDIR}/python-schedule-1.1.0/"
S = "${WORKDIR}/git"

inherit setuptools3
#inherit pypi setuptools3

#DEPENDS += "${PYTHON_PN}-setuptools-scm-native"
RDEPENDS_${PN} += "python3-core"

do_install() {
    python3 setup.py install --prefix ${D}${PYTHON3_SITEPACKAGES_DIR}
}

#PYPI_PACKAGE = "schedule"

