require recipes-qt/qt5/qt5.inc

SUMMARY = "Qt Library for ConnMan"
HOMEPAGE = "https://github.com/nemomobile/libconnman-qt"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://libconnman-qt/clockmodel.h;endline=8;md5=ea9f724050803f15d2d900ce3c5dac88"
DEPENDS += "qtbase qtdeclarative"
PV = "1.0.89+git${SRCPV}"

SRCREV = "79a8d10479ba55951ffa375a66797eedff230dd3"
SRC_URI = "git://github.com/nemomobile/libconnman-qt.git"

S = "${WORKDIR}/git"

inherit pkgconfig

RDEPENDS_${PN} += "connman"
