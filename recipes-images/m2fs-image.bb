#M2FS image based on Angstrom bootstrap image
# modified /home/baileyji/beagle/sources/openembedded-core/meta/recipes-extended/man-pages/man-pages_3.32.bb to point to http://www.mirrorservice.org/sites/ftp.kernel.org/pub/linux/docs/man-pages/
require ${TOPDIR}/sources/meta-angstrom/recipes-images/angstrom/systemd-image.bb

DEPENDS += ""

IMAGE_INSTALL += " \
  man \
  man-pages \
  python-dev \
  python-core \
  python-modules \
  python-numpy \
  python-pyserial \
  python-setuptools \
  python-misc \
  vim \
  nut \
  gdb \
  git \
  kernel-modules \
  dosfstools \
  i2c-tools \
  gdbserver \
  dropbear \
  groff \
  media-ctl \
  yavta \
  nfs-utils \
  samba \
  connman-tests \
  procps \
  packagegroup-sdk-target \
"
#  task-native-sdk \
#"

export IMAGE_BASENAME = "m2fs-image"
